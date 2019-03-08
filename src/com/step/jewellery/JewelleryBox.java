package com.step.jewellery;

public class JewelleryBox {
    private int jewelleryCount;
    private Jewellery jewellery;
    private JewelleryBox jewelleryBox;

    public JewelleryBox(){
    }

    public JewelleryBox(Jewellery jewellery){
        this.jewellery = jewellery;
        this.jewelleryCount++;
    }

    public JewelleryBox(JewelleryBox jewelleryBox){
        this.jewelleryBox = jewelleryBox;
        this.jewelleryCount += jewelleryBox.jewelleryCount;
    }

    public JewelleryBox(Jewellery jewellery, JewelleryBox jewelleryBox){
        this.jewellery = jewellery;
        this.jewelleryBox = jewelleryBox;
        this.jewelleryCount += jewelleryBox.jewelleryCount;
        this.jewelleryCount++;
    }

    public int totalJewelleries() {
        return this.jewelleryCount;
    }
}
