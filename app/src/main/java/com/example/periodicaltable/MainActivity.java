package com.example.periodicaltable;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Movida al filtrar
    //

    private Element[] elements =
            new Element[]{
                    new Element("H", 1, "Hydrogen", "1.00794(4)", "gas"),
                    new Element("He", 2, "Helium", "4.002602(2)", "gas"),
                    new Element("Li", 3, "Lithium", "6.941(2)", "solid"),
                    new Element("Be", 4, "Beryllium", "9.012182(3)", "solid"),
                    new Element("B", 5, "Boron", "10.811(7)", "solid"),
                    new Element("C", 6, "Carbon", "12.0107(8)", "solid"),
                    new Element("N", 7, "Nitrogen", "14.0067(2)", "gas"),
                    new Element("O", 8, "Oxygen", "15.9994(3)", "gas"),
                    new Element("F", 9, "Fluorine", "18.9984032(5)", "gas"),
                    new Element("Ne", 10, "Neon", "20.1797(6)", "gas"),
                    new Element("Na", 11, "Sodium", "22.98976928(2)", "solid"),
                    new Element("Mg", 12, "Magnesium", "24.3050(6)", "solid"),
                    new Element("Al", 13, "Aluminum", "26.9815386(8)", "solid"),
                    new Element("Si", 14, "Silicon", "28.0855(3)", "solid"),
                    new Element("P", 15, "Phosphorus", "30.973762(2)", "solid"),
                    new Element("S", 16, "Sulfur", "32.065(5)", "solid"),
                    new Element("Cl", 17, "Chlorine", "35.453(2)", "gas"),
                    new Element("Ar", 18, "Argon", "39.948(1)", "gas"),
                    new Element("K", 19, "Potassium", "39.0983(1)", "solid"),
                    new Element("Ca", 20, "Calcium", "40.078(4)", "solid"),
                    new Element("Sc", 21, "Scandium", "44.955912(6)", "solid"),
                    new Element("Ti", 22, "Titanium", "47.867(1)", "solid"),
                    new Element("V", 23, "Vanadium", "50.9415(1)", "solid"),
                    new Element("Cr", 24, "Chromium", "51.9961(6)", "solid"),
                    new Element("Mn", 25, "Manganese", "54.938045(5)", "solid"),
                    new Element("Fe", 26, "Iron", "55.845(2)", "solid"),
                    new Element("Co", 27, "Cobalt", "58.933195(5)", "solid"),
                    new Element("Ni", 28, "Nickel", "58.6934(4)", "solid"),
                    new Element("Cu", 29, "Copper", "63.546(3)", "solid"),
                    new Element("Zn", 30, "Zinc", "65.38(2)", "solid"),
                    new Element("Ga", 31, "Gallium", "69.723(1)", "solid"),
                    new Element("Ge", 32, "Germanium", "72.64(1)", "solid"),
                    new Element("As", 33, "Arsenic", "74.92160(2)", "solid"),
                    new Element("Se", 34, "Selenium", "78.96(3)", "solid"),
                    new Element("Br", 35, "Bromine", "79.904(1)", "liquid"),
                    new Element("Kr", 36, "Krypton", "83.798(2)", "gas"),
                    new Element("Rb", 37, "Rubidium", "85.4678(3)", "solid"),
                    new Element("Sr", 38, "Strontium", "87.62(1)", "solid"),
                    new Element("Y", 39, "Yttrium", "88.90585(2)", "solid"),
                    new Element("Zr", 40, "Zirconium", "91.224(2)", "solid"),
                    new Element("Nb", 41, "Niobium", "92.90638(2)", "solid"),
                    new Element("Mo", 42, "Molybdenum", "95.96(2)", "solid"),
                    new Element("Tc", 43, "Technetium", "98", "solid"),
                    new Element("Ru", 44, "Ruthenium", "101.07(2)", "solid"),
                    new Element("Rh", 45, "Rhodium", "102.90550(2)", "solid"),
                    new Element("Pd", 46, "Palladium", "106.42(1)", "solid"),
                    new Element("Ag", 47, "Silver", "107.8682(2)", "solid"),
                    new Element("Cd", 48, "Cadmium", "112.411(8)", "solid"),
                    new Element("In", 49, "Indium", "114.818(3)", "solid"),
                    new Element("Sn", 50, "Tin", "118.710(7)", "solid"),
                    new Element("Sb", 51, "Antimony", "121.760(1)", "solid"),
                    new Element("Te", 52, "Tellurium", "127.60(3)", "solid"),
                    new Element("I", 53, "Iodine", "126.90447(3)", "solid"),
                    new Element("Xe", 54, "Xenon", "131.293(6)", "gas"),
                    new Element("Cs", 55, "Cesium", "132.9054519(2)", "solid"),
                    new Element("Ba", 56, "Barium", "137.327(7)", "solid"),
                    new Element("La", 57, "Lanthanum", "138.90547(7)", "solid"),
                    new Element("Ce", 58, "Cerium", "140.116(1)", "solid"),
                    new Element("Pr", 59, "Praseodymium", "140.90765(2)", "solid"),
                    new Element("Nd", 60, "Neodymium", "144.242(3)", "solid"),
                    new Element("Pm", 61, "Promethium", "145", "solid"),
                    new Element("Sm", 62, "Samarium", "150.36(2)", "solid"),
                    new Element("Eu", 63, "Europium", "151.964(1)", "solid"),
                    new Element("Gd", 64, "Gadolinium", "157.25(3)", "solid"),
                    new Element("Tb", 65, "Terbium", "158.92535(2)", "solid"),
                    new Element("Dy", 66, "Dysprosium", "162.500(1)", "solid"),
                    new Element("Ho", 67, "Holmium", "164.93032(2)", "solid"),
                    new Element("Er", 68, "Erbium", "167.259(3)", "solid"),
                    new Element("Tm", 69, "Thulium", "168.93421(2)", "solid"),
                    new Element("Yb", 70, "Ytterbium", "173.054(5)", "solid"),
                    new Element("Lu", 71, "Lutetium", "174.9668(1)", "solid"),
                    new Element("Hf", 72, "Hafnium", "178.49(2)", "solid"),
                    new Element("Ta", 73, "Tantalum", "180.94788(2)", "solid"),
                    new Element("W", 74, "Tungsten", "183.84(1)", "solid"),
                    new Element("Re", 75, "Rhenium", "186.207(1)", "solid"),
                    new Element("Os", 76, "Osmium", "190.23(3)", "solid"),
                    new Element("Ir", 77, "Iridium", "192.217(3)", "solid"),
                    new Element("Pt", 78, "Platinum", "195.084(9)", "solid"),
                    new Element("Au", 79, "Gold", "196.966569(4)", "solid"),
                    new Element("Hg", 80, "Mercury", "200.59(2)", "liquid"),
                    new Element("Tl", 81, "Thallium", "204.3833(2)", "solid"),
                    new Element("Pb", 82, "Lead", "207.2(1)", "solid"),
                    new Element("Bi", 83, "Bismuth", "208.98040(1)", "solid"),
                    new Element("Po", 84, "Polonium", "209", "solid"),
                    new Element("At", 85, "Astatine", "210", "solid"),
                    new Element("Rn", 86, "Radon", "222", "gas"),
                    new Element("Fr", 87, "Francium", "223", "solid"),
                    new Element("Ra", 88, "Radium", "226", "solid"),
                    new Element("Ac", 89, "Actinium", "227", "solid"),
                    new Element("Th", 90, "Thorium", "232.03806(2)", "solid"),
                    new Element("Pa", 91, "Protactinium", "231.03588(2)", "solid"),
                    new Element("U", 92, "Uranium", "238.02891(3)", "solid"),
                    new Element("Np", 93, "Neptunium", "237", "solid"),
                    new Element("Pu", 94, "Plutonium", "244", "solid"),
                    new Element("Am", 95, "Americium", "243", "solid"),
                    new Element("Cm", 96, "Curium", "247", "solid"),
                    new Element("Bk", 97, "Berkelium", "247", "solid"),
                    new Element("Cf", 98, "Californium", "251", "solid"),
                    new Element("Es", 99, "Einsteinium", "252", "solid"),
                    new Element("Fm", 100, "Fermium", "257", ""),
                    new Element("Md", 101, "Mendelevium", "258", ""),
                    new Element("No", 102, "Nobelium", "259", ""),
                    new Element("Lr", 103, "Lawrencium", "262", ""),
                    new Element("Rf", 104, "Rutherfordium", "267", ""),
                    new Element("Db", 105, "Dubnium", "268", ""),
                    new Element("Sg", 106, "Seaborgium", "271", ""),
                    new Element("Bh", 107, "Bohrium", "272", ""),
                    new Element("Hs", 108, "Hassium", "270", ""),
                    new Element("Mt", 109, "Meitnerium", "276", ""),
                    new Element("Ds", 110, "Darmstadtium", "281", ""),
                    new Element("Rg", 111, "Roentgenium", "280", ""),
                    new Element("Cn", 112, "Copernicium", "285", ""),
                    new Element("Nh", 113, "Nihonium", "284", ""),
                    new Element("Fl", 114, "Flerovium", "289", ""),
                    new Element("Mc", 115, "Moscovium", "288", ""),
                    new Element("Lv", 116, "Livermorium", "293", ""),
                    new Element("Ts", 117, "Tennessine", "294", ""),
                    new Element("Og", 118, "Oganesson", "294", ""),
            };

    private AdaptadorElements adaptadorElements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adaptadorElements = new AdaptadorElements(getApplicationContext(), elements);

        ListView listElements = (ListView) findViewById(R.id.element_list);
        listElements.setAdapter(adaptadorElements);

        listElements.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle datosElemento = new Bundle();
                datosElemento.putString("simbol", elements[position].getSimbol());
                datosElemento.putInt("numero", elements[position].getNumero());
                datosElemento.putString("nom", elements[position].getNom());
                datosElemento.putString("massa_atomica", elements[position].getMassa_atomica());
                datosElemento.putString("estat", elements[position].getEstat());

                Intent i = new Intent(getApplicationContext(), ElementLayout.class);
                i.putExtras(datosElemento);
                startActivity(i);
            }
        });

    }
}


class AdaptadorElements extends ArrayAdapter<Element> {

    private Context context;

    // Creo lienzo
    public AdaptadorElements(Context context, Element[] elements) {
        super(context, R.layout.element, elements);
        this.context = context;
    }

    @NonNull
    @Override
    // Construir cada elemento de la lista
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //Estructura de cada elemento de la lista
        View item = layoutInflater.inflate(R.layout.element, null);

        final Element element = (Element) getItem(position);

        final String estat_element = element.getEstat();

        switch(estat_element){
            case "solid":
                item.setBackgroundColor(Color.parseColor("#000000"));
                break;
            case "gas":
                item.setBackgroundColor(Color.parseColor("#33ff00"));
                break;
            case "liquid":
                item.setBackgroundColor(Color.parseColor("#0000FF"));
                break;
            case "":
                item.setBackgroundColor(Color.parseColor("#FF0000"));
                break;
        }

        TextView texto = (TextView) item.findViewById(R.id.nom);
        String nom = element.getNom();
        texto.setText(nom);
        texto = (TextView) item.findViewById(R.id.pes);
        String massa_atomica = element.getMassa_atomica();
        texto.setText(massa_atomica);
        texto = (TextView) item.findViewById(R.id.numero);
        String numero = String.valueOf(element.getNumero());
        texto.setText(numero);
        texto = (TextView) item.findViewById(R.id.symbol);
        String symbol = element.getSimbol();
        texto.setText(symbol);

        // Repetir hasta la muerte
        return item;
    }




}
