export const environment = {
  production: false,
  backend: {
    protocol: 'http',
    host: 'localhost',
    port: '8080',
    endpoints: {
      add: '/adder/add',
      divide: '/adder/divide',
      multiply: '/adder/multiply',
      substract: '/adder/substract',
    }
  }
};
