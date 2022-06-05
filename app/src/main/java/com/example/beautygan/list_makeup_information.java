package com.example.beautygan;

public class list_makeup_information {
    private int pr_image;
    private String pr_brand;
    private String pr_name;
    private String pr_price;
    private int pr_url;

    public list_makeup_information(int pr_image, String pr_brand, String pr_name, String pr_price, int pr_url) {
        this.pr_image = pr_image;
        this.pr_brand = pr_brand;
        this.pr_name = pr_name;
        this.pr_price = pr_price;
        this.pr_url = pr_url;
    }

    public int get_prImage() {
        return this.pr_image;
    }

    public String get_prBrand() {
        return this.pr_brand;
    }

    public String get_prName() {
        return this.pr_name;
    }

    public String get_prPrice() {
        return this.pr_price;
    }

    public int get_prUrl() { return this.pr_url; }
}
