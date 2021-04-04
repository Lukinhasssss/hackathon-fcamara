import { createContext } from "react"

export type ColetaContextType = {
  cidade: string
  setCidade: (cidade: string) => void
}

export const ColetaContext = createContext<ColetaContextType>({
  cidade: '',
  setCidade: () => null
})