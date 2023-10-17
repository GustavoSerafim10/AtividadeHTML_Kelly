CREATE TABLE Livros (
    ISBN VARCHAR(13) PRIMARY KEY,
    Titulo VARCHAR(255),
    Autor VARCHAR(100),
    AnoPublicacao INT
);
INSERT INTO Funcionarios (Nome, Cargo, Salario) VALUES ('João Silva', 'Gerente', 60000);


SELECT Nome, Cargo FROM Funcionarios WHERE Salario > 50000;



UPDATE Funcionarios SET Salario = 65000 WHERE Nome = 'João Silva';
DELETE FROM Funcionarios WHERE Nome = 'João Silva';
7