package amigodacomida.dto.ingredient;

import com.fasterxml.jackson.annotation.JsonInclude;

public class IngredientDTO {
    String name;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    String quantity;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    String quantitynote;

    public IngredientDTO() {
    }

    public IngredientDTO(String name, String quantity, String quantitynote) {
        this.name = name;
        this.quantity = quantity;
        this.quantitynote = quantitynote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantitynote() {
        return quantitynote;
    }

    public void setQuantitynote(String quantitynote) {
        this.quantitynote = quantitynote;
    }
}
