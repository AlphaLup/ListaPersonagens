package com.breno.listapersonagens;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {
    public List<PersoItem> pegarListaPersoItens (){
        List<PersoItem> persos = new ArrayList<>();

        PersoItem arthur = new PersoItem(0, R.drawable.arthur, "Arthur Cevero", "O Segredo na Floresta");
        PersoItem cesar = new PersoItem(1, R.drawable.cesar, "Cesar Cohen/Kaiser", "O Segredo na Floresta");
        PersoItem joui = new PersoItem(2, R.drawable.joui, "Joui Jouki", "O Segredo na Floresta");
        PersoItem liz = new PersoItem(3, R.drawable.liz, "Elizabeth Webber", "A Ordem Paranormal");
        PersoItem thiago = new PersoItem(4, R.drawable.thiago, "Thiago Fritz", "A Ordem Paranormal");

        persos.add(arthur);
        persos.add(cesar);
        persos.add(joui);
        persos.add(liz);
        persos.add(thiago);

        return persos;
    }

    public List<PersoInfo> pegarListaPersoInfo(){
        List<PersoInfo> persos = new ArrayList<>();

        PersoInfo arthur = new PersoInfo(R.drawable.arthur, "Arthur Cevero", "27", "Guaxuxu", "Especialista", "O Segredo na Floresta");
        PersoInfo cesar = new PersoInfo(R.drawable.cesar, "Cesar Cohen / Kaiser", "30", "Calango", "Combatente", "O Segredo na Floresta");
        PersoInfo joui = new PersoInfo(R.drawable.joui, "Joui Jouki", "23", "Lubisco", "Combatente", "O Segredo na Floresta");
        PersoInfo liz = new PersoInfo(R.drawable.liz, "Elizabeth Webber", "Pré-Deus da morte: 28 / Pós-Deus da morte: 50", "Bagi", "Especialista", "A Ordem Paranormal");
        PersoInfo thiago = new PersoInfo(R.drawable.thiago, "Thiago Fritz", "Pré-Deus da morte: 33 / Pós-Deus da morte: 84", "Rakin god", "Não determinada", "A Ordem Paranormal");

        persos.add(arthur);
        persos.add(cesar);
        persos.add(joui);
        persos.add(liz);
        persos.add(thiago);

        return persos;
    }
}
