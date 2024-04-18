package com.example.api.service;

import com.example.api.entities.CamisetaEntity;
import com.example.api.model.CamisetaModel;
import com.example.api.repository.CamisetaRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CamisetaService {

    private CamisetaRepository camisetaRepository;

    public CamisetaService(CamisetaRepository camisetaRepository) {
        this.camisetaRepository = camisetaRepository;
    }

    public CamisetaModel processCamiseta(CamisetaModel camisetaModel) {
        var camisetaEntity = new CamisetaEntity();
        camisetaEntity.setCor(camisetaModel.getCor());
        camisetaEntity.setTipoCamiseta(camisetaModel.getTipoCamiseta());
        camisetaEntity.setPreco(camisetaModel.getPreco());
        camisetaEntity.setTamanho(camisetaModel.getTamanho());
        camisetaEntity.setTecido(camisetaModel.getTecido());
        var camisetaSaved = camisetaRepository.save(camisetaEntity);

        var resultado = new CamisetaModel(camisetaSaved.getTipoCamiseta(), camisetaSaved.getPreco(),
                camisetaSaved.getCor(), camisetaSaved.getTamanho(), camisetaSaved.getTecido());
        return resultado;
    }

    public List<CamisetaModel> getCamisetas() {
        var camisetaEntityList = camisetaRepository.findAll();
        var camisetaModelList = new ArrayList<CamisetaModel>();

        for (int i = 0; i < camisetaEntityList.size(); i++) {

            var camisetaEntity = camisetaEntityList.get(i);

            var camisetaModel = new CamisetaModel(camisetaEntity.getTipoCamiseta(), camisetaEntity.getPreco(),
                    camisetaEntity.getCor(), camisetaEntity.getTamanho(), camisetaEntity.getTecido());

            camisetaModelList.add(camisetaModel);
        }

        return camisetaModelList;
    }

    public CamisetaModel getCamisetaByIndex(Integer id) {
        var camisetaEntityOptional = camisetaRepository.findById(id);

        if (camisetaEntityOptional.isPresent()) {
            var camisetaEntity = camisetaEntityOptional.get();
            var camisetaModel = new CamisetaModel(camisetaEntity.getTipoCamiseta(), camisetaEntity.getPreco(),
                    camisetaEntity.getCor(), camisetaEntity.getTamanho(), camisetaEntity.getTecido());

            return camisetaModel;
        }

        return null;
    }

    public CamisetaModel updateCamiseta(Integer id, CamisetaModel novaCamisetaModel) {
        var camisetaEntityOptional = camisetaRepository.findById(id);

        if (camisetaEntityOptional.isPresent()) {
            var velhoCamisetaEntity = camisetaEntityOptional.get();

            velhoCamisetaEntity.setTecido(novaCamisetaModel.getTecido());
            velhoCamisetaEntity.setTamanho(novaCamisetaModel.getTamanho());
            velhoCamisetaEntity.setPreco(novaCamisetaModel.getPreco());
            velhoCamisetaEntity.setCor(novaCamisetaModel.getCor());
            velhoCamisetaEntity.setTipoCamiseta(novaCamisetaModel.getTipoCamiseta());

            var novaCamisetaEntity = camisetaRepository.save(velhoCamisetaEntity);

            var camisetaModel = new CamisetaModel(novaCamisetaEntity.getTipoCamiseta(), novaCamisetaEntity.getPreco(),
                    novaCamisetaEntity.getCor(), novaCamisetaEntity.getTamanho(), novaCamisetaEntity.getTecido());

            return camisetaModel;
        }

        return null;
    }

    public void deleteCamiseta(Integer id) throws Exception {
        var camisetaEntityOptional = camisetaRepository.findById(id);
        if (camisetaEntityOptional.isPresent()) {
            camisetaRepository.deleteById(id);
        } else {
            throw new Exception("não existe");
        }
    }
}
