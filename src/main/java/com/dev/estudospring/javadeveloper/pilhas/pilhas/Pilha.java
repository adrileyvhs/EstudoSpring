package com.dev.estudospring.javadeveloper.pilhas.pilhas;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class Pilha {
    private No refNoEntradaPilha;
    private Pilha(){
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
}