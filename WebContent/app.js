Ext.application({
	
    requires: ['Ext.container.Viewport'],
    controllers: ['Users'],
    name: 'AM',

    appFolder: 'app',
    
    launch: function() {
    	//debugger;
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                    xtype: 'userlist',
//                    title: 'Users',
//                    html : 'List of users will go here'
                }
            ]
        });
    }
});