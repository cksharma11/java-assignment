package com.step.range;

public class CharacterRange extends Range<Character> {
    public CharacterRange(Character start, Character end) {
        super(start, end);
    }

    @Override
    void createList() {
        for (Character i = this.start; i <= this.end; i++) {
            this.list.add(i);
        }
    }
}
