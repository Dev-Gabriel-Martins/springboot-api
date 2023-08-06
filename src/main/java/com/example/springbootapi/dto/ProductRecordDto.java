package com.example.springbootapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

//A notações NotBlank e NotNull provaem uma tratamento de dados especial que evita strings vazias ou nulas assim como numeros também
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {


}
