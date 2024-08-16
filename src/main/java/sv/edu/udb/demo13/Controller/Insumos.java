package sv.edu.udb.demo13.Controller;

import com.google.gson.GsonBuilder;
import sv.edu.udb.demo13.Models.Insumo;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import com.google.gson.Gson;


import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "InsumosBean")
@SessionScoped
public class Insumos {
    private List<Insumo> insumos;
    public Insumos(){
       insumos = new ArrayList<>();
       insumos.add(new Insumo(
               "Alka-Seltzer",
               "2024-09-01",
               10,
               "Si es de Bayer es Bueno",
               "https://images-ext-1.discordapp.net/external/Vrw7zKmpoWdM8mcKxZt47K2q7R-cK53xJWhsVCa4d1A/https/m.media-amazon.com/images/I/71kpaxgI9yL._AC_SL1500_.jpg?format=webp&width=608&height=676"));
       insumos.add(new Insumo(
         "Paracetamol",
         "2024-08-20",
          20,
         "MK Medicamentos Totalmente Confiables",
         "https://images-ext-1.discordapp.net/external/0iBd9ZfsGciA76K4uLYAGa3R6XFNj_e_2_0YUOtyDuE/%3Fv%3D638048040101730000/https/walmartsv.vtexassets.com/arquivos/ids/282726/S-Paracetamol-Mk-100-Tabletas-750mg-3-31261.jpg?format=webp&width=676&height=676"));
       insumos.add(new Insumo(
               "Neurobion N Caja 30 Tabletas",
               "2026-11-02",
               50,
               "Neurobion es Bienestar",
               "https://th.bing.com/th/id/OIP.-kJRWxq6bkjVnttn-QpyRgHaHa?rs=1&pid=ImgDetMain"
       ));
       insumos.add(new Insumo(
          "Amoxicilina La Sante 500mg X 10 Capsulas\n",
          "15-08-2025",
          70,
          "La Sante Medicamentos",
          "https://www.farmaciaseconomicaselsalvador.com/PROD/SERV_ADMIN_FILES/Archivos/Imagenes/Articulos_MED/00023382_MED.jpg"
       ));
    }

    public List<Insumo> getInsumos() {
        return insumos;
    }

    public String Json(){
        Gson json = new GsonBuilder().setPrettyPrinting().create();
        return json.toJson(insumos);
    }

    public String showJson(){
        return "insumos";
    }


}
