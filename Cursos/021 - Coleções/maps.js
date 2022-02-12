const users = new Map();

users.set('Luiz', 'admin');
users.set('Claudia', 'admin');
users.set('Cleber', 'user');
users.set('Joana', 'admin');

function getAdmins(map) {
    let admins = [];
    
    for ([key, value] of map) {
        if (value === 'admin') {
            admins.push(key);
        }
    }

    return admins;
}

console.log(getAdmins(users));


