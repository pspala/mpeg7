/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage.helpers;

/**
 *
 * @author Patti Spala <pd.spala@gmail.com>
 */
public class X3DResourceDetail {

    public String resourceName;
    public String parentPath;

    public X3DResourceDetail(String name, String path) {
        this.resourceName = name;
        this.parentPath = path;
    }
}