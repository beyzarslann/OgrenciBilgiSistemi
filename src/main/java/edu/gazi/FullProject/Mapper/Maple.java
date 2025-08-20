package edu.gazi.FullProject.Mapper;

import edu.gazi.FullProject.Dto.OgrenciDto;
import edu.gazi.FullProject.Entity.Ogrenci;

public class Maple {
    public static OgrenciDto entityToDto(Ogrenci ogrenci){
        OgrenciDto ogrenciDto = new OgrenciDto(
                ogrenci.getNum(),
                ogrenci.getAd(),
                ogrenci.getSoyad(),
                ogrenci.getYas()
        );
        return ogrenciDto;
    }

    public static Ogrenci dtoToEntity(OgrenciDto ogrenciDto){
        Ogrenci ogrenci = new Ogrenci(
                ogrenciDto.getNum(),
                ogrenciDto.getAd(),
                ogrenciDto.getSoyad(),
                ogrenciDto.getYas()
        );
        return ogrenci;
    }
}
