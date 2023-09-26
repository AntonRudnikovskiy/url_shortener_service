package faang.school.urlshortenerservice.service;

import faang.school.urlshortenerservice.Hash;
import faang.school.urlshortenerservice.encoder.Base62Encoder;
import faang.school.urlshortenerservice.repository.HashRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class HashGenerator {

    private final HashRepository hashRepository;
    private final Base62Encoder base62Encoder;
    @Value("${hash_generator.unique_numbers}")
    private final int uniqueNumbers;

    @Async
    public void generateBatch() {
        List<Long> numbers = hashRepository.getUniqueNumbers(uniqueNumbers);
        List<Hash> hashes = base62Encoder.encode(numbers);
        hashRepository.save(hashes);
    }
}
