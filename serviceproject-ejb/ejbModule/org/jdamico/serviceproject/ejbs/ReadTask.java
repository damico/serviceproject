package org.jdamico.serviceproject.ejbs;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class ReadTask
 */
@Stateless
public class ReadTask implements ReadTaskRemote, ReadTaskLocal {

    /**
     * Default constructor. 
     */
    public ReadTask() {
        // TODO Auto-generated constructor stub
    }
    
    public String prepareView(){
    	return null;
    }

}
