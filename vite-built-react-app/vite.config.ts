import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    proxy: {
      // prody the locally running Spring Boot app (having the same 
      // /vaadin-app context path) to Vite dev server.
      // Production server should have a similar mapping in the front-proxy
      '/vaadin-app': 'http://localhost:8080'
    }
  }
})


