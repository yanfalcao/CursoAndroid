package br.com.yanfalcao.boaviagem;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Arrays;
import java.util.List;

public class ExpenseListActivity extends ListActivity
                                            implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this,
                                                android.R.layout.simple_list_item_1, listarGastos()));
    }

    private List<String> listarGastos() { return Arrays.asList("Sanduíche R$ 19,90",
                                          "Táxi Aeroporto - Hotel R$ 34,00",
                                          "Revista R$ 12,00"); }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView textView = (TextView) view;
        Toast.makeText(this, "Gasto selecionado: " +
                        textView.getText(), Toast.LENGTH_SHORT).show();
    }
}
