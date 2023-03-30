package fr.uga.l3miage.photonum.service;

import java.util.Collection;

import fr.uga.l3miage.photonum.data.domain.Image;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface ImageService extends BaseService<Image, Integer> {

    /**
     * Deletes an image
     *
     * @param id id of the image to delete
     * @throws EntityNotFoundException when the entity do not already exists
     * @throws DeleteImageException   when an image is shared
     */
    
    void delete(int id) throws EntityNotFoundException, DeleteImageException;

    /**
     * Updates an image
     *
     * @param image image to update
     * @return the updated image
     * @throws EntityNotFoundException when the entity do not already exists
     */ 
    Image update(Image image) throws EntityNotFoundException;

    /**
     * Returns toutes les images 
     *
     * @return toutes les images 
     */ 
    Collection<Image> list();
    
    
}
