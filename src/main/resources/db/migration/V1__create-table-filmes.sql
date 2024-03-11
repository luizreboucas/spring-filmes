CREATE TABLE filmes (
    id VARCHAR(255) PRIMARY KEY,
    ranking INT,
    title VARCHAR(255),
    fullTitle VARCHAR(500),
    year INT,
    image VARCHAR(500),
    crew VARCHAR(500),
    imDbRating DOUBLE,
    imDbRatingCount VARCHAR(255)
);