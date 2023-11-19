# URL Shortener Service

## Описание

Этот проект представляет собой сервис для сокращения URL, который позволяет пользователям генерировать короткие ссылки, которые перенаправляют на исходные длинные URL. Сервис написан на Java с использованием Spring Boot и предоставляет простой и понятный RESTful API для создания и управления сокращёнными ссылками.

## Технологии

- Java
- Spring Boot
- Kafka
- Redis
- PostgreSQL
- Docker

## Как запустить:
```bash
git clone https://github.com/AntonRudnikovskiy/url_shortener_service.git
cd url_shortener_service
docker-compose build 
docker-compose up -d
```

## Примеры использования API
Создание новой короткой ссылки
Запрос:

```http
POST http://localhost:8080/url/
Content-Type: application/json
{
    "url": "https://www.software-testing.ru/component/content/article/3806-qa-tester-beginner-series-a-beginners-guide-to-page-object-model-pom-and-page-factory"
}
```
Ответ:
```
https://www.software-testing.ru/3F
```
Перенаправление с короткой ссылки
```http
GET http://localhost:8080/url/3F
```
Ответ:
```
Перенаправление на исходный URL ("https://www.software-testing.ru/component/content/article/3806-qa-tester-beginner-series-a-beginners-guide-to-page-object-model-pom-and-page-factory").
```

