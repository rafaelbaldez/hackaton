var App = angular.module('App', [
'ngRoute',
'controllers',
'services'
]);

App.config(function($routeProvider){
	$routeProvider
	.when('/', {
		templateUrl: 'views/agente/agente.html',
		controller: 'AgenteCtrl'
	})

	.when('/create', {
		templateUrl: 'views/create.html',
		controller: 'CreateCtrl'
	})

	.when('/editarAgente/:id', {
		templateUrl: 'views/agente/editAgente.html',
		controller: 'AgenteCtrl'
	})
});

App.value('API', 'http://localhost:8081/angular-app/service/');