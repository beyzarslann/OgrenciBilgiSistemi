package edu.gazi.FullProject.Service;

import edu.gazi.FullProject.Dto.OgrenciDto;

import java.util.List;

public interface OgrenciService {

    List<OgrenciDto> getButunOgr();

    void yeniOgrKayit(OgrenciDto ogrenciDto);

    void guncelleTamam(OgrenciDto ogrenciDto);

    OgrenciDto bul(Long id);

    void sil(Long id);
}
