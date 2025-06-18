# Web Event Collector

## Purpose

**Web Event Collector** is a Spring Boot application designed to collect, track, and store web events (such as user actions, page visits, and downloads) in a MongoDB database. It provides a REST API endpoint for tracking events, making it suitable for analytics, auditing, or user behavior tracking on web applications.

## Features

- REST API for tracking web events
- Stores events in MongoDB
- Detects specific actions (e.g., "Download CV")
- CORS enabled for cross-origin requests

## Prerequisites

- Java 21+
- Maven 3.9+
- MongoDB instance (local or remote)
- (Optional) Docker, if you want to run with containers

## Setup

### 1. Clone the Repository

```sh
git clone <your-repo-url>
cd web-event-collector
```

### 2. Configure Environment Variables

Create a `.env` file or set the following environment variables:

- `MONGO_DB_NAME` - Name of your MongoDB database
- `MONGO_DB_URI` - MongoDB connection URI (e.g., `mongodb://localhost:27017`)

Alternatively, you can edit `src/main/resources/application.yaml` to hardcode values (not recommended for production).

### 3. Build the Project

```sh
./mvnw clean package
```

### 4. Run the Application

```sh
./mvnw spring-boot:run
```

Or run the packaged JAR:

```sh
java -jar target/web-event-collector-1.0.0.jar
```

The application will start on port `8080` by default.

### 5. API Usage

- **Track Event:**  
  `POST /api/track/event`  
  Send a JSON payload representing a `WebEvent`.

### 6. Running with Docker

Build and run the Docker image:

```sh
docker build -t web-event-collector .
docker run -e MONGO_DB_NAME=<your-db> -e MONGO_DB_URI=<your-uri> -p 8080:8080 web-event-collector
```

## Project Structure

- `src/main/java/com/recceda/webeventcollector/` - Main application code
- `src/main/resources/application.yaml` - Application configuration
- `src/test/` - Unit and integration tests

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Open a pull request

## License

This project is licensed under the Apache License 2.0.

---

For questions or support, please contact the maintainer.