package com.istl.domaincrawler.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.PackagePrivate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Domain {
    private String domain;
    private String create_date;
    private String update_date;
    private String country;
    boolean isDead;
    private String A;
    private String NS;
    private String CNAME;
    private String MX;
    private String TXT;
}
