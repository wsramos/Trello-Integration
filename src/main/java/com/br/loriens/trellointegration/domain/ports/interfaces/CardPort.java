package com.br.loriens.trellointegration.domain.ports.interfaces;

import com.br.loriens.trellointegration.domain.dtos.CardDTO;
import com.br.loriens.trellointegration.domain.entities.Card;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CardPort {
    ResponseEntity<List<Card>> getAllCardsByListId(String idList);
    ResponseEntity<Card> getCardById(String idCard);
    ResponseEntity<Card> createNewCard(CardDTO cardDTO);
    ResponseEntity<Object> updateCard(String idCard, CardDTO cardDTO);
    ResponseEntity<Object> deleteCard(String idCard);
}
