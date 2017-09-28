import Vue from 'vue'
import App from './App.vue'
import VueResource from 'vue-resource'

let env = process.env.NODE_ENV;

// para utilizar com docker-machine
if(!env){
	env = 'dev-local'
}

let config = require(`./config/config.${env}.json`);

Vue.use(VueResource);
Vue.http.options.root = config.appConfig.urlApi;

new Vue({
  el: '#app',
  render: h => h(App)
})
