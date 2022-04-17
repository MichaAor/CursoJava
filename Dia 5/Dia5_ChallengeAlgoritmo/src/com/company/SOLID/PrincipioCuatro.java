package com.company.SOLID;

/*basicamente distribuir los metodos de una interfaz en varias, para asi no heredar metodos que no se van a usar*/

interface PrincipioCuatro {
    String getTipo();
}


interface Vista{
    int getOpciones();
}


class Opciones implements PrincipioCuatro{
    @Override
    public String getTipo(){
        return "mesa";
    }
}


class Twopciones implements PrincipioCuatro,Vista {

    @Override
    public String getTipo() {
        return "mesa";
    }

    @Override
    public int getOpciones() {
        return 12;
    }
}



