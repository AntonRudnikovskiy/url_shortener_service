package faang.school.urlshortenerservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "hash")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Hash {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hash_sequence")
    @SequenceGenerator(name = "hash_sequence", sequenceName = "unique_number_sequence", allocationSize = 1)
    private String hash;
}