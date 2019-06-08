package com.javagda26.zad1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data // getter, setter, requiredargsconstructor, tostring, equalshashcode
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long numerIndeksu;
    private String imie, nazwisko;
}
