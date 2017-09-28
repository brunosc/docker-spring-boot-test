<template>
  <div id="app">
    <img src="./assets/logo.png">
    <h1>{{ msg }}</h1>

    <p v-for="state in states" :key="state.id">{{state.name}}</p>

    <button class="botao botao-padrao" @click="findStates()">Atualizar</button>
    <button class="botao botao-padrao" @click="seed()">Gerar dados</button>
  </div>
</template>

<script>
import StateService from './domain/state/StateService'

export default {
  name: 'app',
  data () {
    return {
      msg: 'Estados cadastrados',
      states: []
    }
  },

  methods: {
    findStates() {      
      this.service.findAll()
                  .then(states => {
                    console.log(states);
                      this.states = states;
                  },
                  err => console.log(err));
    },

    seed() {
      this.service.seed()
                  .then(() => {
                      this.findStates();
                  }, err => console.log(err));
    }
    
  },

  mounted() {
      this.service = new StateService(this.$resource);

      this.findStates();
  }
}
</script>

<style lang="scss">
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

h1, h2 {
  font-weight: normal;
}

.botao {
    display: inline-block;
    padding: 10px;
    border-radius: 3px;
    margin: 10px;
    font-size: 1.2em;
}

.botao-padrao {
    background: darkcyan;
    color: white;
}
</style>
