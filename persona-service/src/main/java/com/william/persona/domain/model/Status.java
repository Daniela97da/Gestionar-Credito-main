

import lombok.Getter;

@Getter
public enum Status {

    ACTIVO("Activo"),
    INACTIVO("Inactivo");

    private String description;

    Status(String description) {
        this.description = description;
    }
}
