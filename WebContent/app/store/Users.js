/**
 * http://usejsdoc.org/
 */
Ext.define('AM.store.Users', {
    extend: 'Ext.data.Store',
    model: 'AM.model.User',
    autoLoad: true,
    proxy: {
        type: 'ajax',
        url: 'api/userLogin/welcome.html',
        reader: {
            type: 'json',
            model: 'AM.model.User'
        }
    }
});