package com.workintech.s17d2.tax;

import org.springframework.stereotype.Component;

@Component
public class DeveloperTax implements Taxable{
    @Override
    public Double getSimpleTaxRate() {
        return 0.15d;
    }

    @Override
    public Double getMiddleTaxRate() {
        return 0.30d;
    }

    @Override
    public Double getUpperTaxRate() {
        return 0.50d;
    }
}
