package olivera.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType setType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getSetType() {
        return setType;
    }

    public void setSetType(PetType setType) {
        this.setType = setType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
