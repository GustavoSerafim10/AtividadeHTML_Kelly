CREATE TABLE Cliente (
    CPF VARCHAR(11) PRIMARY KEY,
    Nome VARCHAR(255),
    Telefone VARCHAR(20)
);

CREATE TABLE Carro (
    Placa VARCHAR(10) PRIMARY KEY,
    Marca VARCHAR(100),
    Modelo VARCHAR(100),
    Cor VARCHAR(50)
);

CREATE TABLE Acidente (
    Codigo INT PRIMARY KEY,
    Data DATE,
    Local VARCHAR(255),
    Observacao TEXT,
    Carro_Placa VARCHAR(10),
    FOREIGN KEY (Carro_Placa) REFERENCES Carro(Placa)
);
