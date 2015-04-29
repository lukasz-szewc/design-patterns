/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.structual.proxy;

/**
 *
 */
public interface PersonRetriever {

    /**
     * Retrieves instance of Person class - for given id.
     *
     * @param id identifier
     * @return Person instance for given id.
     */
    Person retrievePerson(int id);

}
