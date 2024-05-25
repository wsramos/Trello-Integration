package com.br.loriens.trellointegration.domain.mappers;

import com.br.loriens.trellointegration.domain.dtos.CardDTO;
import com.br.loriens.trellointegration.domain.entities.Card;
import com.br.loriens.trellointegration.shared.exceptions.IllegalArgumentIdTrelloException;
import org.mapstruct.Mapper;

@Mapper
public interface CardMapper {

    Card cardDTOtoCard(CardDTO cardDTO) throws IllegalArgumentIdTrelloException;
}
