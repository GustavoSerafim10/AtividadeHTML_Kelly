CREATE TABLE Aluno (
    Matricula INT PRIMARY KEY,
    Nome VARCHAR(255)
);

CREATE TABLE Curso (
    Codigo INT PRIMARY KEY,
    Nome VARCHAR(255)
);

CREATE TABLE Disciplina (
    Codigo INT PRIMARY KEY,
    Nome VARCHAR(255),
    Departamento_Codigo INT
);

CREATE TABLE Departamento (
    Codigo INT PRIMARY KEY,
    Nome VARCHAR(255)
);

CREATE TABLE Matricula (
    Aluno_Matricula INT,
    Curso_Codigo INT,
    PRIMARY KEY (Aluno_Matricula, Curso_Codigo),
    FOREIGN KEY (Aluno_Matricula) REFERENCES Aluno(Matricula),
    FOREIGN KEY (Curso_Codigo) REFERENCES Curso(Codigo)
);

CREATE TABLE PreRequisito (
    Disciplina_Codigo INT,
    PreRequisito_Codigo INT,
    PRIMARY KEY (Disciplina_Codigo, PreRequisito_Codigo),
    FOREIGN KEY (Disciplina_Codigo) REFERENCES Disciplina(Codigo),
    FOREIGN KEY (PreRequisito_Codigo) REFERENCES Disciplina(Codigo)
);
