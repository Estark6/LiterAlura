package com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record AutorDados(@JsonAlias("name") String autor,
                         @JsonAlias("birth_year") Integer anoNascimento,
                         @JsonAlias("death_year") Integer anoFalecimento) {
}