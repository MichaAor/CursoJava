package com.Bootcamp.Dia16_ChallengeAlgoritmo.Util;

import java.io.Serializable;

public class JWTResponse implements Serializable {
    private static final long serialVersionUID =-8091879091924046844L;
    private final String jwtToken;

    public JWTResponse(String jwttoken) {
        this.jwtToken = jwttoken;
    }

    public String getToken() {
        return this.jwtToken;
    }

}
