public class ListaDuplamenteLigada {

    private No cabeca;
    private No cauda;

    //metodo que adiciona no final da lista
    public void adicionar(No novoElemento){
        if(this.cabeca == null){
            this.cabeca = novoElemento;
            this.cauda = this.cabeca;
        }else{
            this.cauda.setProx(novoElemento);
            novoElemento.setAnt(this.cauda);
            this.cauda = novoElemento;
        }
    }

    public void print(){
        No aux = this.cabeca;
        //No fim = null;
        //imprimir do início ao fim
        while(aux != null){
            String dado = aux.getDado();
            System.out.print(dado + "->");
            //fim = aux;
            aux = aux.getProx();
        }
        System.out.print("Fim\n\n");
         aux = cauda;
        while(aux != null){
            String dado = aux.getDado();
            System.out.print(dado + "->");
            aux = aux.getAnt();
        }
        System.out.print("Inicio\n\n");

    }

}
