package com.javagda26.zad2_autostrada;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class InformacjeOPojezdzie {
    private String nrRej;
    private TypPojazdu typPojazdu;
    private LocalDateTime dataWjazdu;

    public InformacjeOPojezdzie(String nrRej, TypPojazdu typPojazdu) {
        this.nrRej = nrRej;
        this.typPojazdu = typPojazdu;
    }
}
