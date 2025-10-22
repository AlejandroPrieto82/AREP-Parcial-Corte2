package eci.edu.arep.parcial.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Services implements ServicesInterface{

    @Override
    public String fibwin(int value) throws Exception {
        if(value < 2){
            throw new Exception();
        }
        
        ArrayList<Integer> serie = new ArrayList<>();
        ArrayList<Integer> ventana = new ArrayList<>();

		for (int i = 0; i <= value; i++) {
			if(i == 0){
				serie.add(0);
			}else if(i == 1){
				serie.add(1);
			}else{
				serie.add(serie.get(i-1)+serie.get(i-2));
			}
        }
		
		int sum;
		for(int i = 0 ; i <= value ; i++){
			if(i+3>serie.size()){
				break;
			}
			sum = 0;
			for(int x = 0; x<3;x++){
				sum = sum + serie.get(i+x);
			}
			ventana.add(sum);
		}

        String res = "serie: "+ serie.toString() + " | " + "ventana: " + ventana.toString();
		res = res.replaceAll("\\[", "");
		res = res.replaceAll("\\]", "");
        return res;
    }
}