package com.step.unocards;

public class IdentityCard implements Duplicable<DuplicateIdentityCard> {
    private int id;
    private String name;

    public IdentityCard(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public DuplicateIdentityCard duplicate() {
        return new DuplicateIdentityCard(id,name);
    }
}
