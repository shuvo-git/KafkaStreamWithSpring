package com.istl.domaincrawler.model;

import lombok.*;
import lombok.experimental.PackagePrivate;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Domain implements Serializable {
    private String domain;
    private String create_date;
    private String update_date;
    private String country;
    boolean isDead;
    private String[] A;
    private String[] NS;
    private String[] CNAME;
    private List<MXNode> MX;
    private String[] TXT;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    class MXNode{
        String exchange;
        int priority;
    }
}
