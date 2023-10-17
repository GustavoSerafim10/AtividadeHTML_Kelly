create database Atividade05;

use Atividade05;

CREATE TABLE Paciente (
    CPF VARCHAR(11) PRIMARY KEY,
    Nome VARCHAR(255),
    Endereco VARCHAR(255),
    Telefone VARCHAR(20),
    NomePlanoSaude VARCHAR(100)
);

CREATE TABLE Medico (
    CRM VARCHAR(10) PRIMARY KEY,
    Nome VARCHAR(255),
    Telefone VARCHAR(20),
    Email VARCHAR(255)
);

CREATE TABLE Medicamento (
    Codigo INT PRIMARY KEY,
    Nome VARCHAR(255),
    Tipo VARCHAR(50),
    Dosagem VARCHAR(50),
    InstrucoesUso VARCHAR(255)
);

CREATE TABLE Exame (
    Codigo INT PRIMARY KEY,
    Nome VARCHAR(255),
    Observacao TEXT,
    Resultado TEXT
);

CREATE TABLE Consulta (
    Numero INT PRIMARY KEY,
    Data DATE,
    Tipo VARCHAR(50),
    Medico_CRM VARCHAR(10),
    Paciente_CPF VARCHAR(11),
    FOREIGN KEY (Medico_CRM) REFERENCES Medico(CRM),
    FOREIGN KEY (Paciente_CPF) REFERENCES Paciente(CPF)
);

CREATE TABLE ConsultaMedicamento (
    Consulta_Numero INT,
    Medicamento_Codigo INT,
    PRIMARY KEY (Consulta_Numero, Medicamento_Codigo),
    FOREIGN KEY (Consulta_Numero) REFERENCES Consulta(Numero),
    FOREIGN KEY (Medicamento_Codigo) REFERENCES Medicamento(Codigo)
);

CREATE TABLE ConsultaExame (
    Consulta_Numero INT,
    Exame_Codigo INT,
    PRIMARY KEY (Consulta_Numero, Exame_Codigo),
    FOREIGN KEY (Consulta_Numero) REFERENCES Consulta(Numero),
    FOREIGN KEY (Exame_Codigo) REFERENCES Exame(Codigo)
);
