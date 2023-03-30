package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Image;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface ImageService extends BaseService<Image, Integer> {

    /**
     * Deletes an image
     *
     * @param id id of the image to delete
     * @throws EntityNotFoundException when the entity do not already exists
     * @throws DeleteImageException   quand l'image est partagée ou quand l'image n'est lié à aucune photo dans une impression en cours
     */
    void delete(int id) throws EntityNotFoundException, DeleteImageException;
    
}
