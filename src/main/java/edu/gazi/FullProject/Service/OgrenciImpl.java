package edu.gazi.FullProject.Service;

import edu.gazi.FullProject.Dto.OgrenciDto;
import edu.gazi.FullProject.Entity.Ogrenci;
import edu.gazi.FullProject.Mapper.Maple;
import edu.gazi.FullProject.Repository.OgrenciRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OgrenciImpl implements OgrenciService{
    private OgrenciRepo ogrenciRepo;

    @Override
    public List<OgrenciDto> getButunOgr() {
        List<Ogrenci> ogrenciListesi = ogrenciRepo.findAll();
        List<OgrenciDto> ogrenciDtoListesi = ogrenciListesi.stream()
                .map((ogrenci) -> Maple.entityToDto(ogrenci))
                .collect(Collectors.toList());
        return ogrenciDtoListesi;
    }

    @Override
    public void yeniOgrKayit(OgrenciDto ogrenciDto) {
        ogrenciRepo.save(Maple.dtoToEntity(ogrenciDto));
    }

    @Override
    public void guncelleTamam(OgrenciDto ogrenciDto) {
        ogrenciRepo.save(Maple.dtoToEntity(ogrenciDto));
    }

    @Override
    public OgrenciDto bul(Long id) {
        Ogrenci ogrenci=ogrenciRepo.findById(id).get();
        return Maple.entityToDto(ogrenci);
    }

    @Override
    public void sil(Long id) {
        ogrenciRepo.deleteById(id);
    }

    public OgrenciImpl(OgrenciRepo ogrenciRepo) {
        this.ogrenciRepo = ogrenciRepo;
    }

    public OgrenciRepo getOgrenciRepo() {
        return ogrenciRepo;
    }

    public void setOgrenciRepo(OgrenciRepo ogrenciRepo) {
        this.ogrenciRepo = ogrenciRepo;
    }
}
