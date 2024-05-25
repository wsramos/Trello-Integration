package com.br.loriens.trellointegration.domain.entities;


import com.br.loriens.trellointegration.shared.exceptions.IllegalArgumentIdTrelloException;
import com.br.loriens.trellointegration.shared.utils.ConstantsUtils;
import lombok.*;

import java.util.List;

/**
 * @author William Sampaio Ramos
 *
 */

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Data
public class Card {
    @Setter
    private String name;
    @Setter
    private String desc;
    @Setter
    private Object pos;
    @Setter
    private String due;
    @Setter
    private String start;
    @Setter
    private Boolean dueComplete;

    private String idList;
    private List<String> idMembers;
    private List<String> idLabels;

    @Setter
    private String urlSource;
    @Setter
    private String fileSource;
    @Setter
    private String mimeType;
    @Setter
    private String idCardSource;
    @Setter
    private String keepFromSource;
    @Setter
    private String address;
    @Setter
    private String locationName;
    @Setter
    private String coordinates;

    public void setIdList(String idList) throws IllegalArgumentIdTrelloException {
        if(ConstantsUtils.trelloIdPattern.matcher(idList).matches()){
            this.idList = idList;
        } else {
            throw new IllegalArgumentIdTrelloException("Attribute does not match the specified pattern");
        }
    }

    public void setIdMembers(List<String> idMembers) throws IllegalArgumentIdTrelloException {
        for(String idMember : idMembers){
            if(ConstantsUtils.trelloIdPattern.matcher(idMember).matches()){
                this.idMembers.add(idMember);
            } else {
                throw new IllegalArgumentIdTrelloException("Attribute does not match the specified pattern");
            }
        }
    }

    public void setIdLabels(List<String> idLabels) throws IllegalArgumentIdTrelloException {
        for(String idLabel : idLabels){
            if(ConstantsUtils.trelloIdPattern.matcher(idLabel).matches()){
                this.idMembers.add(idLabel);
            } else {
                throw new IllegalArgumentIdTrelloException("Attribute does not match the specified pattern");
            }
        }
    }
}
