package com.br.loriens.trellointegration.domain.adapters.services;

import com.br.loriens.trellointegration.domain.dtos.CardDTO;
import com.br.loriens.trellointegration.domain.entities.Card;
import com.br.loriens.trellointegration.domain.mappers.CardMapper;
import com.br.loriens.trellointegration.domain.ports.interfaces.CardPort;
import com.br.loriens.trellointegration.shared.exceptions.IllegalArgumentIdTrelloException;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CardServiceImpl implements CardPort {
    private final CardMapper cardMapper = Mappers.getMapper(CardMapper.class);

    @Override
    public ResponseEntity<List<Card>> getAllCardsByListId(String idList) {
        return null;
    }

    @Override
    public ResponseEntity<Card> getCardById(String idCard) {
        return null;
    }

    @Override
    public ResponseEntity<Card> createNewCard(CardDTO cardDTO) {
        try{
            Card card = cardMapper.cardDTOtoCard(cardDTO);
        } catch (IllegalArgumentIdTrelloException e){
            return ResponseEntity.badRequest().build();
        }
        return null;
    }

    @Override
    public ResponseEntity<Object> updateCard(String idCard, CardDTO cardDTO) {

        return null;
    }

    @Override
    public ResponseEntity<Object> deleteCard(String idCard) {
        return null;
    }
}
