package com.dev.estudodev.javadevelop.pilhas;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class Pilha {
    private No refNoEntradaPilha;
    public Pilha(){
       this.refNoEntradaPilha= null;
    }
    public  No top(){
        return  refNoEntradaPilha;
    }
    public void push(No novo){
       No refaux = refNoEntradaPilha;
       refNoEntradaPilha = novo;
       refNoEntradaPilha.setRefNo(refaux);
    }
    public No pop(){
        if(!isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        }
        return  null;
    }
    public boolean isEmpty(){
        if (refNoEntradaPilha == null){
            return  true;
        }
        return  false;
    }
    @Override
    public  String toString(){
        String strRetorno = "--------------\n";
        strRetorno+= "    Pilha\n";
        No noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar!=null){
               strRetorno += "[No  dado  = "+noAuxiliar.getDado() + " ]\n";
               noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        strRetorno +="-===================-\n";
        return  strRetorno;
    }
}