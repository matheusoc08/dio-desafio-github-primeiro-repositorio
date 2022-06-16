class ContaBancaria{
    constructor(agencia, numero, tipo) {
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = 0;
    }

    get saldo() {
        return console.log('Seu saldo é de ' + this._saldo);
    }

    set saldo(valor) {
        this._saldo = valor;
    }

    sacar(valor) {
        if (valor > this._saldo) {
            this._saldo -= valor;
            return 'Operacao negada. Saldo insuficiente';
        }
        return console.log("Realizado saque de " + valor);
    }

    depositar(valor) {        
        this._saldo += valor;
        return console.log('Realizado deposito de ' + valor);
    }
}

class ContaCorrente extends ContaBancaria{
    constructor(agencia, numero, cartaoCredito) {
        super(agencia, numero);
        this.tipo = 'corrente';
        this._cartaCredito = this.cartaoCredito;
    }

    get cartaoCredito() {
        return this._cartaoCredito;
    }

    set cartaCredito(limite) {
        this.cartaCredito = limite;
    }
}

class ContaPoupanca extends ContaBancaria{
    constructor(agencia, numero) {
        super(agencia, numero);
        this.tipo = 'poupanca';
    }
}

class ContaUniversitaria extends ContaBancaria{
    constructor(agencia, numero) {
        super(agencia, numero);
        this.tipo = 'universitaria';
    }

     sacar(valor) {
        if (valor <= 500) {
            this._saldo -= valor;
            return console.log("Realizado saque de " + valor);
        }
        return console.log("Sua conta não tem permisão para saques superiores a R$500");
    }
}

// const minhaConta = new ContaCorrente(121, 12121, true);
// minhaConta.saldo;
// minhaConta.depositar(100);